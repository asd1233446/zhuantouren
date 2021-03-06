//
//  BrickPhotoCell.h
//  BrickMan
//
//  Created by TZ on 16/7/22.
//  Copyright © 2016年 BrickMan. All rights reserved.
//

#define kCellIdentifier_BrickPhotoCell @"BrickPhotoCell"
#import <UIKit/UIKit.h>
#import "BMAttachment.h"

typedef NS_ENUM(NSInteger, BrickPhotoCellType) {
    BrickPhotoCellType_One = 0,
    BrickPhotoCellType_Two,
    BrickPhotoCellType_Three,
};

@interface BrickPhotoCell : UICollectionViewCell

@property (strong, nonatomic) UIImageView *photoImgView;
@property (strong, nonatomic) BMAttachment *attachmentModel;
@property (assign, nonatomic) BrickPhotoCellType type;

+ (CGSize)cellHeithWithAttachment:(BMAttachment *)attachment;
@end
